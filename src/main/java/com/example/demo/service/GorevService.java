package com.example.demo.service;

import com.example.demo.entity.Gorev;
import com.example.demo.repository.GorevRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GorevService {

    private final GorevRepository gorevRepository;

    public List<Gorev> tumGorevleriGetir() {
        return gorevRepository.findAll();
    }

    public Gorev gorevKaydet(Gorev gorev) {
        return gorevRepository.save(gorev);
    }

    public void gorevSil(Long id) {
        gorevRepository.deleteById(id);
    }

    public Gorev gorevGuncelle(Long id, Gorev yeniGorevBilgisi) {
        Gorev mevcutGorev = gorevRepository.findById(id).orElseThrow();

        mevcutGorev.setBaslik(yeniGorevBilgisi.getBaslik());
        mevcutGorev.setAciklama(yeniGorevBilgisi.getAciklama());
        mevcutGorev.setTarih(yeniGorevBilgisi.getTarih());
        mevcutGorev.setTamamlandi(yeniGorevBilgisi.isTamamlandi());

        return gorevRepository.save(mevcutGorev);
    }
}