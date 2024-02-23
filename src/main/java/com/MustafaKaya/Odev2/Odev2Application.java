package com.MustafaKaya.Odev2;

import com.MustafaKaya.Entities.Professor;
import com.MustafaKaya.Entities.Rector;
import com.MustafaKaya.Entities.Staff;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Odev2Application {

	public static void main(String[] args) {
		int baseSalary = 20000;

		Professor professor = new Professor();
		professor.setSalary(baseSalary);
		professor.MaasHesapla(professor);
		System.out.println(professor.getSalary());

		Rector rector = new Rector();
		rector.setSalary(baseSalary);
		rector.MaasHesapla(rector);
		System.out.println(rector.getSalary());




//		SpringApplication.run(Odev2Application.class, args);

	}

}
