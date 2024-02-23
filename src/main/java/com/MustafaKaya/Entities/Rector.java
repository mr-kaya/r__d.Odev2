package com.MustafaKaya.Entities;

import com.MustafaKaya.Services.IService;

public class Rector extends AdministrativeStaff implements IService {
    private float rectorCoefficient = 3.8F;

    @Override
    public void MaasHesapla(Staff staff) {
        staff.setSalary((int) (staff.getSalary() * rectorCoefficient * getSalaryCoefficient()));
    }
}
