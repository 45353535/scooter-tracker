package yads;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class y01 extends pw2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f118043c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharsetDecoder f118044a = st.f115925c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f118045b = st.f115924b.newDecoder();

    @Override // yads.pw2
    public final fr1 a(ir1 ir1Var, ByteBuffer byteBuffer) {
        String string;
        String str = null;
        try {
            string = this.f118044a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                string = this.f118045b.decode(byteBuffer).toString();
                this.f118045b.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f118045b.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th2) {
                this.f118045b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f118044a.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new fr1(new c11(bArr, null, null));
        }
        Matcher matcher = f118043c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strA = ci.a(strGroup);
                strA.getClass();
                if (strA.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strA.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new fr1(new c11(bArr, str, str2));
    }
}
