package com.ilike.interpreter;

import java.util.Map;

/**
 * 变量解释器
 */
public class VarExpression extends  Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 根据变量的名称返回变量的值
     * @param var
     * @return
     */
    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(key);
    }
}
