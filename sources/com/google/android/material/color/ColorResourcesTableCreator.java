package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class ColorResourcesTableCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte f26023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PackageInfo f26024b = new PackageInfo(1, "android");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator f26025c = new Comparator<ColorResource>() { // from class: com.google.android.material.color.ColorResourcesTableCreator.1
        @Override // java.util.Comparator
        public int compare(ColorResource colorResource, ColorResource colorResource2) {
            return colorResource.f26028c - colorResource2.f26028c;
        }
    };

    static class ColorResource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f26026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte f26027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final short f26028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f26029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f26030e;

        ColorResource(int i10, String str, int i11) {
            this.f26029d = str;
            this.f26030e = i11;
            this.f26028c = (short) (65535 & i10);
            this.f26027b = (byte) ((i10 >> 16) & 255);
            this.f26026a = (byte) ((i10 >> 24) & 255);
        }
    }

    private static class PackageChunk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ResChunkHeader f26031a = new ResChunkHeader(512, 288, c());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final PackageInfo f26032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringPoolChunk f26033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final StringPoolChunk f26034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final TypeSpecChunk f26035e;

        PackageChunk(PackageInfo packageInfo, List list) {
            this.f26032b = packageInfo;
            this.f26033c = new StringPoolChunk(false, b(list));
            this.f26034d = new StringPoolChunk(true, a(list));
            this.f26035e = new TypeSpecChunk(list);
        }

        private String[] a(List list) {
            String[] strArr = new String[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                strArr[i10] = ((ColorResource) list.get(i10)).f26029d;
            }
            return strArr;
        }

        private String[] b(List list) {
            int i10 = 0;
            if (list.isEmpty()) {
                return new String[0];
            }
            int i11 = ((ColorResource) list.get(0)).f26027b;
            String[] strArr = new String[i11];
            while (true) {
                int i12 = i11 - 1;
                if (i10 >= i12) {
                    strArr[i12] = "color";
                    return strArr;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("?");
                int i13 = i10 + 1;
                sb2.append(i13);
                strArr[i10] = sb2.toString();
                i10 = i13;
            }
        }

        int c() {
            return this.f26033c.a() + 288 + this.f26034d.a() + this.f26035e.b();
        }

        void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f26031a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26032b.f26036a));
            char[] charArray = this.f26032b.f26037b.toCharArray();
            for (int i10 = 0; i10 < 128; i10++) {
                if (i10 < charArray.length) {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.h(charArray[i10]));
                } else {
                    byteArrayOutputStream.write(ColorResourcesTableCreator.h((char) 0));
                }
            }
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26033c.a() + 288));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(0));
            this.f26033c.c(byteArrayOutputStream);
            this.f26034d.c(byteArrayOutputStream);
            this.f26035e.c(byteArrayOutputStream);
        }
    }

    static class PackageInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f26037b;

        PackageInfo(int i10, String str) {
            this.f26036a = i10;
            this.f26037b = str;
        }
    }

    private static class ResChunkHeader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short f26038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final short f26039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26040c;

        ResChunkHeader(short s10, short s11, int i10) {
            this.f26038a = s10;
            this.f26039b = s11;
            this.f26040c = i10;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.m(this.f26038a));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m(this.f26039b));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26040c));
        }
    }

    private static class ResEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f26041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26042b;

        ResEntry(int i10, int i11) {
            this.f26041a = i10;
            this.f26042b = i11;
        }

        void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.m((short) 8));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m((short) 2));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26041a));
            byteArrayOutputStream.write(ColorResourcesTableCreator.m((short) 8));
            byteArrayOutputStream.write(new byte[]{0, Ascii.FS});
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26042b));
        }
    }

    private static class ResTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ResChunkHeader f26043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26044b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f26046d = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringPoolChunk f26045c = new StringPoolChunk(new String[0]);

        ResTable(Map map) {
            this.f26044b = map.size();
            for (Map.Entry entry : map.entrySet()) {
                List list = (List) entry.getValue();
                Collections.sort(list, ColorResourcesTableCreator.f26025c);
                this.f26046d.add(new PackageChunk((PackageInfo) entry.getKey(), list));
            }
            this.f26043a = new ResChunkHeader((short) 2, (short) 12, a());
        }

        private int a() {
            Iterator it = this.f26046d.iterator();
            int iC = 0;
            while (it.hasNext()) {
                iC += ((PackageChunk) it.next()).c();
            }
            return this.f26045c.a() + 12 + iC;
        }

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f26043a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26044b));
            this.f26045c.c(byteArrayOutputStream);
            Iterator it = this.f26046d.iterator();
            while (it.hasNext()) {
                ((PackageChunk) it.next()).d(byteArrayOutputStream);
            }
        }
    }

    private static class StringPoolChunk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ResChunkHeader f26047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f26050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f26051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f26052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f26053g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List f26054h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List f26055i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f26056j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f26057k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f26058l;

        StringPoolChunk(String... strArr) {
            this(false, strArr);
        }

        private Pair b(String str) {
            return new Pair(this.f26056j ? ColorResourcesTableCreator.o(str) : ColorResourcesTableCreator.n(str), Collections.EMPTY_LIST);
        }

        int a() {
            return this.f26058l;
        }

        void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f26047a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26048b));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26049c));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26056j ? 256 : 0));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26050d));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26051e));
            Iterator it = this.f26052f.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.l(((Integer) it.next()).intValue()));
            }
            Iterator it2 = this.f26053g.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.l(((Integer) it2.next()).intValue()));
            }
            Iterator it3 = this.f26054h.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write((byte[]) it3.next());
            }
            int i10 = this.f26057k;
            if (i10 > 0) {
                byteArrayOutputStream.write(new byte[i10]);
            }
            Iterator it4 = this.f26055i.iterator();
            while (it4.hasNext()) {
                Iterator it5 = ((List) it4.next()).iterator();
                while (it5.hasNext()) {
                    ((StringStyledSpan) it5.next()).b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(ColorResourcesTableCreator.l(-1));
            }
        }

        StringPoolChunk(boolean z10, String... strArr) {
            this.f26052f = new ArrayList();
            this.f26053g = new ArrayList();
            this.f26054h = new ArrayList();
            this.f26055i = new ArrayList();
            this.f26056j = z10;
            int length = 0;
            for (String str : strArr) {
                Pair pairB = b(str);
                this.f26052f.add(Integer.valueOf(length));
                Object obj = pairB.first;
                length += ((byte[]) obj).length;
                this.f26054h.add((byte[]) obj);
                this.f26055i.add((List) pairB.second);
            }
            int size = 0;
            for (List<StringStyledSpan> list : this.f26055i) {
                for (StringStyledSpan stringStyledSpan : list) {
                    this.f26052f.add(Integer.valueOf(length));
                    length += stringStyledSpan.f26059a.length;
                    this.f26054h.add(stringStyledSpan.f26059a);
                }
                this.f26053g.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i10 = length % 4;
            int i11 = i10 == 0 ? 0 : 4 - i10;
            this.f26057k = i11;
            int size2 = this.f26054h.size();
            this.f26048b = size2;
            this.f26049c = this.f26054h.size() - strArr.length;
            boolean z11 = this.f26054h.size() - strArr.length > 0;
            if (!z11) {
                this.f26053g.clear();
                this.f26055i.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.f26053g.size() * 4);
            this.f26050d = size3;
            int i12 = length + i11;
            this.f26051e = z11 ? size3 + i12 : 0;
            int i13 = size3 + i12 + (z11 ? size : 0);
            this.f26058l = i13;
            this.f26047a = new ResChunkHeader((short) 1, (short) 28, i13);
        }
    }

    private static class StringStyledSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f26059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f26061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f26062d;

        void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26060b));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26061c));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26062d));
        }
    }

    private static class TypeChunk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ResChunkHeader f26063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f26065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f26066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ResEntry[] f26067e;

        TypeChunk(List list, Set set, int i10) {
            byte[] bArr = new byte[64];
            this.f26065c = bArr;
            this.f26064b = i10;
            bArr[0] = SignedBytes.MAX_POWER_OF_TWO;
            this.f26067e = new ResEntry[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                this.f26067e[i11] = new ResEntry(i11, ((ColorResource) list.get(i11)).f26030e);
            }
            this.f26066d = new int[i10];
            int i12 = 0;
            for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
                if (set.contains(Short.valueOf(s10))) {
                    this.f26066d[s10] = i12;
                    i12 += 16;
                } else {
                    this.f26066d[s10] = -1;
                }
            }
            this.f26063a = new ResChunkHeader((short) 513, (short) 84, a());
        }

        private int b() {
            return c() + 84;
        }

        private int c() {
            return this.f26066d.length * 4;
        }

        int a() {
            return b() + (this.f26067e.length * 16);
        }

        void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f26063a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.f26023a, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26064b));
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(b()));
            byteArrayOutputStream.write(this.f26065c);
            for (int i10 : this.f26066d) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.l(i10));
            }
            for (ResEntry resEntry : this.f26067e) {
                resEntry.a(byteArrayOutputStream);
            }
        }
    }

    private static class TypeSpecChunk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ResChunkHeader f26068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f26070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TypeChunk f26071d;

        TypeSpecChunk(List list) {
            this.f26069b = ((ColorResource) list.get(list.size() - 1)).f26028c + 1;
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(((ColorResource) it.next()).f26028c));
            }
            this.f26070c = new int[this.f26069b];
            for (short s10 = 0; s10 < this.f26069b; s10 = (short) (s10 + 1)) {
                if (hashSet.contains(Short.valueOf(s10))) {
                    this.f26070c[s10] = 1073741824;
                }
            }
            this.f26068a = new ResChunkHeader((short) 514, (short) 16, a());
            this.f26071d = new TypeChunk(list, hashSet, this.f26069b);
        }

        private int a() {
            return (this.f26069b * 4) + 16;
        }

        int b() {
            return a() + this.f26071d.a();
        }

        void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f26068a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{ColorResourcesTableCreator.f26023a, 0, 0, 0});
            byteArrayOutputStream.write(ColorResourcesTableCreator.l(this.f26069b));
            for (int i10 : this.f26070c) {
                byteArrayOutputStream.write(ColorResourcesTableCreator.l(i10));
            }
            this.f26071d.d(byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] h(char c10) {
        return new byte[]{(byte) (c10 & 255), (byte) ((c10 >> '\b') & 255)};
    }

    private static byte[] i(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    static byte[] j(Context context, Map map) throws IOException {
        PackageInfo packageInfo;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        PackageInfo packageInfo2 = new PackageInfo(127, context.getPackageName());
        HashMap map2 = new HashMap();
        ColorResource colorResource = null;
        for (Map.Entry entry : map.entrySet()) {
            ColorResource colorResource2 = new ColorResource(((Integer) entry.getKey()).intValue(), context.getResources().getResourceEntryName(((Integer) entry.getKey()).intValue()), ((Integer) entry.getValue()).intValue());
            if (!context.getResources().getResourceTypeName(((Integer) entry.getKey()).intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + colorResource2.f26029d + ", typeId=" + Integer.toHexString(colorResource2.f26027b & 255));
            }
            if (colorResource2.f26026a == 1) {
                packageInfo = f26024b;
            } else {
                if (colorResource2.f26026a != 127) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) colorResource2.f26026a));
                }
                packageInfo = packageInfo2;
            }
            if (!map2.containsKey(packageInfo)) {
                map2.put(packageInfo, new ArrayList());
            }
            ((List) map2.get(packageInfo)).add(colorResource2);
            colorResource = colorResource2;
        }
        byte b10 = colorResource.f26027b;
        f26023a = b10;
        if (b10 == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ResTable(map2).b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] k(short s10) {
        return s10 > 127 ? new byte[]{(byte) ((127 & (s10 >> 8)) | 128), (byte) (s10 & 255)} : new byte[]{(byte) (s10 & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] l(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] m(short s10) {
        return new byte[]{(byte) (s10 & 255), (byte) ((s10 >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] n(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] bArrM = m((short) charArray.length);
        bArr[0] = bArrM[0];
        bArr[1] = bArrM[1];
        for (int i10 = 0; i10 < charArray.length; i10++) {
            byte[] bArrH = h(charArray[i10]);
            int i11 = i10 * 2;
            bArr[i11 + 2] = bArrH[0];
            bArr[i11 + 3] = bArrH[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] o(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return i(k((short) str.length()), k((short) bytes.length), bytes, new byte[]{0});
    }
}
