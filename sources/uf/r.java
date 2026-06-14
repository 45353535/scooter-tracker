package uf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {
    public static final long b(Reader reader, Writer out, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long c(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return b(reader, writer, i10);
    }

    public static final void d(Reader reader, Function1 action) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it = e(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f93236a;
            c.a(bufferedReader, null);
        } finally {
        }
    }

    public static final Sequence e(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return kotlin.sequences.k.i(new o(bufferedReader));
    }

    public static final byte[] f(URL url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "<this>");
        InputStream inputStreamOpenStream = url.openStream();
        try {
            Intrinsics.checkNotNull(inputStreamOpenStream);
            byte[] bArrC = b.c(inputStreamOpenStream);
            c.a(inputStreamOpenStream, null);
            return bArrC;
        } finally {
        }
    }

    public static final List g(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        d(reader, new Function1() { // from class: uf.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.h(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(ArrayList arrayList, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        arrayList.add(it);
        return Unit.f93236a;
    }

    public static final String i(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        c(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
