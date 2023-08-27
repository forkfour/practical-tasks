package Road.walking.lesson57_stream_collect_collector.task;

import Road.walking.lesson57_stream_collect_collector.model.Department;
import Road.walking.lesson57_stream_collect_collector.model.Employee;

import java.util.List;
import java.util.SortedMap;

/**
 * Предоставьте список сотрудников по каждому имени.
 * Имена должны быть представлены в алфавитном порядке.
 */
public class Task11 implements StatisticTask<SortedMap<String, List<Employee>>> {
    @Override
    public SortedMap<String, List<Employee>> calculate(List<Department> departments) {
        return null;
    }
}
