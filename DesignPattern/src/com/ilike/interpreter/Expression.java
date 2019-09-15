package com.ilike.interpreter;


import java.util.Map;

/**
 * 抽象类表达式
 *   通过map的键值对，可以获取到变量的值
 */
public abstract class Expression {
    /**
     * 解释公式和数值的关系
     * @param var
     * @return
     */
    public abstract int interpreter(Map<String,Integer> var);
}
