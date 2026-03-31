package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("A task", 1),
                new Job("B task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDscName = new JobDescByName();
        int rsl = cmpDscName.compare(
                new Job("B task", 1),
                new Job("A task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmpAscPrior = new JobAscByPriority();
        int rsl = cmpAscPrior.compare(
                new Job("Task", 1),
                new Job("Task", 5)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDscPrior = new JobDescByPriority();
        int rsl = cmpDscPrior.compare(
                new Job("Task", 5),
                new Job("Task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameAndPriorityAsc() {
        Comparator<Job> cmpNamePriorityAsc = new JobAscByName()
                .thenComparing(new JobAscByPriority());
        Job job1 = new Job("Fix bug", 1);
        Job job2 = new Job("Fix bug", 4);
        Job job3 = new Job("Fix bug", 2);
        assertThat(cmpNamePriorityAsc.compare(job1, job2)).isLessThan(0);
        assertThat(cmpNamePriorityAsc.compare(job2, job3)).isGreaterThan(0);
        assertThat(cmpNamePriorityAsc.compare(job1, job3)).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameAscAndPriorityDesc() {
        Comparator<Job> cmpNameAscPriorDesc = new JobAscByName()
                .thenComparing(new JobDescByPriority());

        int rsl = cmpNameAscPriorDesc.compare(
                new Job("Fix bug", 5),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameDescAndPriorityAsc() {
        Comparator<Job> cmpNameDescPriorAsc = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNameDescPriorAsc.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 5)
        );

        assertThat(rsl).isLessThan(0);
    }
}