package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f49014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f49015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f49016c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, 13, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f49017d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    static {
        HashMap map = new HashMap();
        f49014a = map;
        map.put('v', 'A');
        f49014a.put('S', 'B');
        f49014a.put('o', 'C');
        f49014a.put('a', 'D');
        f49014a.put('j', 'E');
        f49014a.put('c', 'F');
        f49014a.put('7', 'G');
        f49014a.put('d', 'H');
        f49014a.put('R', 'I');
        f49014a.put('z', 'J');
        f49014a.put('p', 'K');
        f49014a.put('W', 'L');
        f49014a.put('i', 'M');
        f49014a.put('f', 'N');
        f49014a.put('G', 'O');
        f49014a.put('y', 'P');
        f49014a.put('N', 'Q');
        f49014a.put('x', 'R');
        f49014a.put('Z', 'S');
        f49014a.put('n', 'T');
        f49014a.put('V', 'U');
        f49014a.put('5', 'V');
        f49014a.put('k', 'W');
        f49014a.put('+', 'X');
        f49014a.put('D', 'Y');
        f49014a.put('H', 'Z');
        f49014a.put('L', 'a');
        f49014a.put('Y', 'b');
        f49014a.put('h', 'c');
        f49014a.put('J', 'd');
        f49014a.put('4', 'e');
        f49014a.put('6', 'f');
        f49014a.put('l', 'g');
        f49014a.put('t', 'h');
        f49014a.put('0', 'i');
        f49014a.put('U', 'j');
        f49014a.put('3', 'k');
        f49014a.put('Q', 'l');
        f49014a.put('r', 'm');
        f49014a.put('g', 'n');
        f49014a.put('E', 'o');
        f49014a.put('u', 'p');
        f49014a.put('q', 'q');
        f49014a.put('8', 'r');
        f49014a.put('s', 's');
        f49014a.put('w', 't');
        f49014a.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), 'u');
        f49014a.put('X', 'v');
        f49014a.put('M', 'w');
        f49014a.put('e', 'x');
        f49014a.put('B', 'y');
        f49014a.put('A', 'z');
        f49014a.put('T', '0');
        f49014a.put('2', '1');
        f49014a.put('F', '2');
        f49014a.put('b', '3');
        f49014a.put('9', '4');
        f49014a.put('P', '5');
        f49014a.put('1', '6');
        f49014a.put('O', '7');
        f49014a.put('I', '8');
        f49014a.put('K', '9');
        f49014a.put('m', '+');
        f49014a.put('C', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        HashMap map2 = new HashMap();
        f49015b = map2;
        map2.put('A', 'v');
        f49015b.put('B', 'S');
        f49015b.put('C', 'o');
        f49015b.put('D', 'a');
        f49015b.put('E', 'j');
        f49015b.put('F', 'c');
        f49015b.put('G', '7');
        f49015b.put('H', 'd');
        f49015b.put('I', 'R');
        f49015b.put('J', 'z');
        f49015b.put('K', 'p');
        f49015b.put('L', 'W');
        f49015b.put('M', 'i');
        f49015b.put('N', 'f');
        f49015b.put('O', 'G');
        f49015b.put('P', 'y');
        f49015b.put('Q', 'N');
        f49015b.put('R', 'x');
        f49015b.put('S', 'Z');
        f49015b.put('T', 'n');
        f49015b.put('U', 'V');
        f49015b.put('V', '5');
        f49015b.put('W', 'k');
        f49015b.put('X', '+');
        f49015b.put('Y', 'D');
        f49015b.put('Z', 'H');
        f49015b.put('a', 'L');
        f49015b.put('b', 'Y');
        f49015b.put('c', 'h');
        f49015b.put('d', 'J');
        f49015b.put('e', '4');
        f49015b.put('f', '6');
        f49015b.put('g', 'l');
        f49015b.put('h', 't');
        f49015b.put('i', '0');
        f49015b.put('j', 'U');
        f49015b.put('k', '3');
        f49015b.put('l', 'Q');
        f49015b.put('m', 'r');
        f49015b.put('n', 'g');
        f49015b.put('o', 'E');
        f49015b.put('p', 'u');
        f49015b.put('q', 'q');
        f49015b.put('r', '8');
        f49015b.put('s', 's');
        f49015b.put('t', 'w');
        f49015b.put('u', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        f49015b.put('v', 'X');
        f49015b.put('w', 'M');
        f49015b.put('x', 'e');
        f49015b.put('y', 'B');
        f49015b.put('z', 'A');
        f49015b.put('0', 'T');
        f49015b.put('1', '2');
        f49015b.put('2', 'F');
        f49015b.put('3', 'b');
        f49015b.put('4', '9');
        f49015b.put('5', 'P');
        f49015b.put('6', '1');
        f49015b.put('7', 'O');
        f49015b.put('8', 'I');
        f49015b.put('9', 'K');
        f49015b.put('+', 'm');
        f49015b.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), 'C');
    }

    public static String a(String str) {
        return r0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : r0.c(str);
    }
}
