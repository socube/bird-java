package com.bird.core.security.coder;

import com.bird.core.security.Hex;
import com.bird.core.security.SecurityCoder;

import java.security.MessageDigest;

/**
 * MD加密组件
 * Created by liuxx on 2017/5/16.
 */
public abstract class MDCoder extends SecurityCoder {

    /**
     * MD2加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeMD2(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("MD2");
        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * MD4加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeMD4(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("MD4");
        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * MD5加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeMD5(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * Tiger加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeTiger(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("Tiger");
        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * TigerHex加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static String encodeTigerHex(byte[] data) throws Exception {
        // 执行消息摘要
        byte[] b = encodeTiger(data);
        // 做十六进制编码处理
        return new String(Hex.encode(b));
    }

    /**
     * Whirlpool加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeWhirlpool(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("Whirlpool");
        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * WhirlpoolHex加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static String encodeWhirlpoolHex(byte[] data) throws Exception {
        // 执行消息摘要
        byte[] b = encodeWhirlpool(data);
        // 做十六进制编码处理
        return new String(Hex.encode(b));
    }

    /**
     * GOST3411加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static byte[] encodeGOST3411(byte[] data) throws Exception {
        // 初始化MessageDigest
        MessageDigest md = MessageDigest.getInstance("GOST3411");
        // 执行消息摘要
        return md.digest(data);
    }

    /**
     * GOST3411Hex加密
     *
     * @param data 待加密数据
     * @return byte[] 消息摘要
     * @throws Exception
     */
    public static String encodeGOST3411Hex(byte[] data) throws Exception {
        // 执行消息摘要
        byte[] b = encodeGOST3411(data);
        // 做十六进制编码处理
        return new String(Hex.encode(b));
    }
}