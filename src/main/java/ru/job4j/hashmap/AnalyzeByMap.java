package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double totalScore = 0;
        int countSubjects = 0;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                countSubjects++;
            }
        }

        return countSubjects == 0 ? 0 : totalScore / countSubjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            List<Subject> subjects = pupil.subjects();
            for (Subject subject : subjects) {
                sum += subject.score();
            }
            double average = subjects.isEmpty() ? 0 : sum / subjects.size();
            result.add(new Label(pupil.name(), average));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjectSum = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectSum.put(subject.name(),
                        subjectSum.getOrDefault(subject.name(), 0) + subject.score());
            }
        }

        List<Label> result = new ArrayList<>();
        int pupilCount = pupils.size();

        for (Map.Entry<String, Integer> entry : subjectSum.entrySet()) {
            double average = pupilCount == 0 ? 0 : (double) entry.getValue() / pupilCount;
            result.add(new Label(entry.getKey(), average));
        }

        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> studentList = new ArrayList<>();

        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            studentList.add(new Label(pupil.name(), sum));
        }

        studentList.sort(Comparator.naturalOrder());
        return studentList.get(studentList.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectSum = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjectSum.put(subject.name(),
                        subjectSum.getOrDefault(subject.name(), 0) + subject.score());
            }
        }

        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : subjectSum.entrySet()) {
            result.add(new Label(entry.getKey(), entry.getValue()));
        }

        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1); // предмет с наибольшей суммой
    }
}