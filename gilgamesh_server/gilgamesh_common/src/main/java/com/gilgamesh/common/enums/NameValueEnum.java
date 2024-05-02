package com.gilgamesh.common.enums;

/**
 * @author takeEasy9
 * @version 1.0.0
 * @description 枚举名称的枚举接口
 * @createDate 2024/5/2 15:35
 * @since 1.0.0
 */
public interface NameValueEnum<T> extends ValueEnum<T> {
    /**
     * 获取枚举名称
     * @return 枚举名称
     */
    String getName();
}
