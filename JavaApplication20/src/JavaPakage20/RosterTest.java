/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaPakage20;

/**
 *
 * @author Marcin-PC
 */
public class RosterTest {
    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) { 
            p.printPerson();
        }
    }
    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }
    
    public static void printPerson(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
    interface CheckPerson {
        boolean test(Person p);
    }
    class CheckPersonEligibleForSelectiveService implements CheckPerson {
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }
    printPerson(
    roster, new CheckPersonEligibleForSelectiveService());
    
    
}
