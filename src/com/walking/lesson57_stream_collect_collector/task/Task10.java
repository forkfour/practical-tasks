package Road.walking.lesson57_stream_collect_collector.task;

import Road.walking.lesson57_stream_collect_collector.model.Department;
import Road.walking.lesson57_stream_collect_collector.model.Employee;

import java.util.List;
import java.util.Map;

/**
 * Предоставьте список сотрудников по каждому имени.
 */
public class Task10 implements StatisticTask<Map<String, List<Employee>>> {
    @Override
    public Map<String, List<Employee>> calculate(List<Department> departments) {
        return null;
    }
}
