package Road.walking.lesson57_stream_collect_collector.task;

import Road.walking.lesson57_stream_collect_collector.model.Department;
import Road.walking.lesson57_stream_collect_collector.model.Employee;

import java.util.List;
import java.util.Map;

/**
 * Предоставьте самого старшего обладателя каждого из имен.
 * Попробуйте сделать это без использования downstream.
 */
public class Task5 implements StatisticTask<Map<String, Employee>> {
    @Override
    public Map<String, Employee> calculate(List<Department> departments) {
        return null;
    }
}
