package com.ilike.interpreter;

import java.util.Map;

/**
 * 抽象的运算符号解释器，每个运算符号都只和自己左右两个数字有关系
 */
public class SymbolExpression  extends Expression{

    protected Expression left;

    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 因为SymbolExpression是让子类来实现的，因此interpreter是一个默认实现
     * @param var
     * @return
     */
    @Override
    public int interpreter(Map<String, Integer> var) {
        return 0;
    }
}
