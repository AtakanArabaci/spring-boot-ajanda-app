package com.example.demo.controller;

import com.example.demo.entity.Gorev;
import com.example.demo.service.GorevService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gorevler")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class GorevController {

    private final GorevService gorevService;

    @GetMapping
    public List<Gorev> tumGorevleriGetir() {
        return gorevService.tumGorevleriGetir();
    }

    @PostMapping
    public Gorev gorevEkle(@RequestBody Gorev gorev) {
        return gorevService.gorevKaydet(gorev);
    }

    @DeleteMapping("/{id}")
    public void gorevSil(@PathVariable Long id) {
        gorevService.gorevSil(id);
    }

    @PutMapping("/{id}")
    public Gorev gorevGuncelle(@PathVariable Long id, @RequestBody Gorev yeniGorev) {
        return gorevService.gorevGuncelle(id, yeniGorev);
    }

    // YENİ: Tek tıkla tamamla / geri al endpoint'i
    @PatchMapping("/{id}/tamamla")
    public Gorev gorevDurumDegistir(@PathVariable Long id) {
        Gorev mevcut = gorevService.tumGorevleriGetir().stream()
                .filter(g -> g.getId().equals(id))
                .findFirst().orElseThrow();
        mevcut.setTamamlandi(!mevcut.isTamamlandi());
        return gorevService.gorevKaydet(mevcut);
    }
}