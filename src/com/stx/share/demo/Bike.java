package com.stx.share.demo;

/**
 * 共享单车
 */
public class Bike extends Vehicle {

	/**
	 * 调用父类构造方法完成车辆编号的赋值
	 * @param id
	 */
    public Bike(String id) {
        // to-do: 代码实现
        super(id);
    }

    /**
     * 覆盖父类showInfo方法，用于显示单车的租车说明
     */
    @Override
    public String showInfo() {
    	// to-do：代码实现

        return "自行车每小时1元";
    }

}
