package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AviaSoulsTest {
    Ticket ticket1 = new Ticket("Внуково", "Пулково", 5000, 4,6);
    Ticket ticket2 = new Ticket("Внуково", "Домодедово", 2000, 4,7);
    Ticket ticket3 = new Ticket("Внуково", "Пулково", 4700, 4,8);
    Ticket ticket4 = new Ticket("Внуково", "Калуга", 9000, 3,4);
    Ticket ticket5 = new Ticket("Внуково", "Пулково", 2342, 12,13);
    Ticket ticket6 = new Ticket("Внуково", "Пулково", 7000, 4,6);
    Ticket ticket7 = new Ticket("Внуково", "Калуга", 1000, 5,8);
    Ticket ticket8 = new Ticket("Внуково", "Пулково", 2341, 2,9);
    Ticket ticket9 = new Ticket("Внуково", "Калуга", 2642, 12,15);
    AviaSouls aviaSouls = new AviaSouls();

    void Initializer()
    {
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        aviaSouls.add(ticket7);
        aviaSouls.add(ticket8);
        aviaSouls.add(ticket9);
    }

    @Test
    public void checkingSortingviComareToMethodSearch()
    {
        Initializer();
        Ticket[] expected = {ticket8,ticket5,  ticket3, ticket1,ticket6};
        Ticket[] actual = aviaSouls.search("Внуково", "Пулково");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkingSortingviComareToMethodSearchAndSortBy()
    {
        Ticket ticket1 = new Ticket("Внуково", "Пулково", 5000, 4,6);
        Ticket ticket5 = new Ticket("Внуково", "Пулково", 2342, 12,13);
        Ticket ticket6 = new Ticket("Внуково", "Пулково", 7000, 4,6);
        Ticket ticket8 = new Ticket("Внуково", "Пулково", 2341, 2,9);
        Ticket ticket3 = new Ticket("Внуково", "Пулково", 4700, 4,8);
        AviaSouls aviaSouls2 = new AviaSouls();
        aviaSouls2.add(ticket1);
        aviaSouls2.add(ticket3);
        aviaSouls2.add(ticket5);
        aviaSouls2.add(ticket6);
        aviaSouls2.add(ticket8);
        Ticket[] expected = {ticket5,ticket1,  ticket6, ticket3,ticket8};
        TicketTimeComparator comparator = new TicketTimeComparator();
        Ticket[] actual = aviaSouls2.searchAndSortBy("Внуково", "Пулково",comparator);
        Assertions.assertArrayEquals(expected, actual);
    }
}
