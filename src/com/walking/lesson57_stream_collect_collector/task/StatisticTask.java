package Road.walking.lesson57_stream_collect_collector.task;

import Road.walking.lesson57_stream_collect_collector.model.Department;

import java.util.List;

public interface StatisticTask<R> {
    R calculate(List<Department> departments);
}
