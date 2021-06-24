package org.entitylabs.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.entitylabs.dto.HeroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hero")
public class HeroController {

	@GetMapping
	public ResponseEntity<List<HeroDTO>> getListOfHeros() {

		HeroDTO hero1 = new HeroDTO();
		hero1.setId(1L);
		hero1.setName("Adam");
		hero1.setPower("Fly");
		hero1.setAlterEgo("None");

		HeroDTO hero2 = new HeroDTO();
		hero2.setId(1L);
		hero2.setName("Adam");
		hero2.setPower("Fly");
		hero2.setAlterEgo("None");

		HeroDTO hero3 = new HeroDTO();
		hero3.setId(1L);
		hero3.setName("Adam");
		hero3.setPower("Fly");
		hero3.setAlterEgo("None");

		HeroDTO hero4 = new HeroDTO();
		hero4.setId(1L);
		hero4.setName("Adam");
		hero4.setPower("Fly");
		hero4.setAlterEgo("None");

		List<HeroDTO> heros = List.of(hero1, hero2, hero3, hero4);

		return new ResponseEntity<List<HeroDTO>>(heros, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<HeroDTO> addHero(@RequestBody HeroDTO hero) {

		HeroDTO hero1 = new HeroDTO();
		hero1.setId(1L);
		hero1.setName("Adam");
		hero1.setPower("Fly");
		hero1.setAlterEgo("None");

		HeroDTO hero2 = new HeroDTO();
		hero2.setId(1L);
		hero2.setName("Adam");
		hero2.setPower("Fly");
		hero2.setAlterEgo("None");

		HeroDTO hero3 = new HeroDTO();
		hero3.setId(1L);
		hero3.setName("Adam");
		hero3.setPower("Fly");
		hero3.setAlterEgo("None");

		HeroDTO hero4 = new HeroDTO();
		hero4.setId(1L);
		hero4.setName("Adam");
		hero4.setPower("Fly");
		hero4.setAlterEgo("None");

		List<HeroDTO> heros = List.of(hero1, hero2, hero3, hero4);

		List<HeroDTO> foundHero = heros.stream()
				.filter(herox -> herox.getName().equalsIgnoreCase(hero.getName().trim())).collect(Collectors.toList());

		if (foundHero.size() > 0) {
			return new ResponseEntity<HeroDTO>(hero, HttpStatus.OK);
		} else {

			return new ResponseEntity<HeroDTO>(hero, HttpStatus.UNPROCESSABLE_ENTITY);
		}

	}
}
