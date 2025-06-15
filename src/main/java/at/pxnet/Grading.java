package at.pxnet;

public final class Grading {
    private Grading() {
        throw new UnsupportedOperationException("Cannot instantiate this class");
    }

    public static boolean isFailing(Person person) {
        int[] grades = person.getGrades();

        if (grades.length < 3) {
            throw new IllegalStateException("Cannot check if grades is smaller than 3");
        }

        int countFours = 0;
        for (int grade : grades) {
            if (grade == 5) {
                return  true;
            }
            if (grade == 4) {
                countFours++;
            }
        }
        return countFours >= 3;
    }
}
