package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestNoAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizenNext = new Citizen("2f44a", "Pavel Setev");
        PassportOffice office = new PassportOffice();
        office.add(citizenNext);
        boolean tryAdd = office.add(citizenNext);
        assertThat(tryAdd).isFalse();
    }
}