package com.ilike.interpreter;

import java.util.Map;
/**
 * 减法解析器
 */
public class SubSymbolExpression extends SymbolExpression {
    public SubSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var)-super.right.interpreter(var);
    }
}
