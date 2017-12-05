package cn.acyou.entity;

import java.util.List;

public interface Sortable {

    List<Sort> getSorts();

    void addSort(Sort sort);

}
