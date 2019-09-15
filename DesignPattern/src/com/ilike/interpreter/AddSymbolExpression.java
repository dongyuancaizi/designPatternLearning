package com.ilike.interpreter;

import java.util.Map;

/**
 * 加法解析器
 */
public class AddSymbolExpression extends SymbolExpression {

    public AddSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 处理相加
     * @param var
     * @return
     */
    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
