package Road.walking.lesson57_stream_collect_collector.task;

import Road.walking.lesson57_stream_collect_collector.model.Department;
import Road.walking.lesson57_stream_collect_collector.model.Employee;

import java.util.List;

/**
 * Предоставьте список всех сотрудников компании.
 */
public class Task1 implements StatisticTask<List<Employee>> {
    @Override
    public List<Employee> calculate(List<Department> departments) {
        return null;
    }
}
