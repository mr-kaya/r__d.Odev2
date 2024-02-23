package com.MustafaKaya.Entities;

import com.MustafaKaya.Services.IService;

public class Professor extends Faculty implements IService {
    private float professorCoefficient = 3.5F;

    @Override
    public void MaasHesapla(Staff staff) {
        staff.setSalary((int) (staff.getSalary() * professorCoefficient * getSalaryCoefficient()));
    }
}
