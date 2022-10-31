package hoangnguyen.io.statisticservice.repository;

import hoangnguyen.io.statisticservice.entity.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticRepo extends JpaRepository<Statistic, Integer> {
}
