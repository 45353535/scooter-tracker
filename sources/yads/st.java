package yads;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class st {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f115923a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f115924b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f115925c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f115926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f115927e;

    static {
        Charset.forName(CharEncoding.UTF_16BE);
        f115926d = Charset.forName("UTF-16LE");
        f115927e = Charset.forName("UTF-16");
    }
}
