package io.appmetrica.analytics.protobuf.nano;

import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class MessageNanoPrinter {
    private static final String INDENT = "  ";
    private static final int MAX_STRING_LEN = 200;

    private MessageNanoPrinter() {
    }

    private static void appendQuotedBytes(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            if (i10 == 92 || i10 == 34) {
                stringBuffer.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                stringBuffer.append((char) i10);
            } else if (i10 < 32 || i10 >= 127) {
                stringBuffer.append(String.format("\\%03o", Integer.valueOf(i10)));
            } else {
                stringBuffer.append((char) i10);
            }
        }
        stringBuffer.append('\"');
    }

    private static String deCamelCaseify(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (i10 == 0) {
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else if (Character.isUpperCase(cCharAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(cCharAt));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    private static String escapeString(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < ' ' || cCharAt > '~' || cCharAt == '\"' || cCharAt == '\'') {
                sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static <T extends MessageNano> String print(T t10) {
        if (t10 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            print(null, t10, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e10) {
            return "Error printing proto: " + e10.getMessage();
        } catch (InvocationTargetException e11) {
            return "Error printing proto: " + e11.getMessage();
        }
    }

    private static String sanitizeString(String str) {
        if (!str.startsWith("http") && str.length() > 200) {
            str = str.substring(0, 200) + "[...]";
        }
        return escapeString(str);
    }

    private static void print(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        if (obj == null) {
            return;
        }
        if (obj instanceof MessageNano) {
            int length = stringBuffer.length();
            if (str != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(deCamelCaseify(str));
                stringBuffer2.append(" <\n");
                stringBuffer.append(INDENT);
            }
            Class<?> cls = obj.getClass();
            for (Field field : cls.getFields()) {
                int modifiers = field.getModifiers();
                String name = field.getName();
                if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                    Class<?> type = field.getType();
                    Object obj2 = field.get(obj);
                    if (type.isArray()) {
                        if (type.getComponentType() == Byte.TYPE) {
                            print(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i10 = 0; i10 < length2; i10++) {
                                print(name, Array.get(obj2, i10), stringBuffer, stringBuffer2);
                            }
                        }
                    } else {
                        print(name, obj2, stringBuffer, stringBuffer2);
                    }
                }
            }
            for (Method method : cls.getMethods()) {
                String name2 = method.getName();
                if (name2.startsWith("set")) {
                    String strSubstring = name2.substring(3);
                    try {
                        if (((Boolean) cls.getMethod("has" + strSubstring, null).invoke(obj, null)).booleanValue()) {
                            print(strSubstring, cls.getMethod("get" + strSubstring, null).invoke(obj, null), stringBuffer, stringBuffer2);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
            }
            if (str != null) {
                stringBuffer.setLength(length);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
                return;
            }
            return;
        }
        if (obj instanceof Map) {
            String strDeCamelCaseify = deCamelCaseify(str);
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(strDeCamelCaseify);
                stringBuffer2.append(" <\n");
                int length3 = stringBuffer.length();
                stringBuffer.append(INDENT);
                print(C4240b4.i.W, entry.getKey(), stringBuffer, stringBuffer2);
                print("value", entry.getValue(), stringBuffer, stringBuffer2);
                stringBuffer.setLength(length3);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(">\n");
            }
            return;
        }
        String strDeCamelCaseify2 = deCamelCaseify(str);
        stringBuffer2.append(stringBuffer);
        stringBuffer2.append(strDeCamelCaseify2);
        stringBuffer2.append(": ");
        if (obj instanceof String) {
            String strSanitizeString = sanitizeString((String) obj);
            stringBuffer2.append("\"");
            stringBuffer2.append(strSanitizeString);
            stringBuffer2.append("\"");
        } else if (obj instanceof byte[]) {
            appendQuotedBytes((byte[]) obj, stringBuffer2);
        } else {
            stringBuffer2.append(obj);
        }
        stringBuffer2.append(IOUtils.LINE_SEPARATOR_UNIX);
    }
}
