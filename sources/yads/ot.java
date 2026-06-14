package yads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ot implements je2 {
    public int a(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        ie2.b(i10, length);
        while (i10 < length) {
            if (a(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean a(char c10);

    @Override // yads.je2
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
