package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Arrays;
import java.util.BitSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class CharMatcher implements Predicate<Character> {

    private static final class And extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CharMatcher f28822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharMatcher f28823c;

        And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f28822b = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f28823c = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f28822b.g(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f28823c.g(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f28822b.matches(c10) && this.f28823c.matches(c10);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.f28822b + ", " + this.f28823c + ")";
        }
    }

    private static final class Any extends NamedFastMatcher {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final CharMatcher f28824c = new Any();

        private Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.length() == 0 ? "" : String.valueOf(c10);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c10);
            return new String(cArr);
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i10) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i10, length);
            if (i10 == length) {
                return -1;
            }
            return i10;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }
    }

    private static final class AnyOf extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f28825b;

        public AnyOf(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f28825b = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            for (char c10 : this.f28825b) {
                bitSet.set(c10);
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return Arrays.binarySearch(this.f28825b, c10) >= 0;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c10 : this.f28825b) {
                sb2.append(CharMatcher.h(c10));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    private static final class Ascii extends NamedFastMatcher {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final CharMatcher f28826c = new Ascii();

        Ascii() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 <= 127;
        }
    }

    @GwtIncompatible
    private static final class BitSetMatcher extends NamedFastMatcher {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BitSet f28827c;

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            bitSet.or(this.f28827c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f28827c.get(c10);
        }

        private BitSetMatcher(BitSet bitSet, String str) {
            super(str);
            this.f28827c = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    private static final class BreakingWhitespace extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final CharMatcher f28828b = new BreakingWhitespace();

        private BreakingWhitespace() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 != ' ' && c10 != 133 && c10 != 5760) {
                if (c10 != 8199) {
                    if (c10 != 8287 && c10 != 12288 && c10 != 8232 && c10 != 8233) {
                        switch (c10) {
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                                break;
                            default:
                                if (c10 >= 8192 && c10 <= 8202) {
                                    return true;
                                }
                                break;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    private static final class Digit extends RangesMatcher {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final CharMatcher f28829e = new Digit();

        private Digit() {
            super("CharMatcher.digit()", j(), i());
        }

        private static char[] i() {
            char[] cArr = new char[37];
            for (int i10 = 0; i10 < 37; i10++) {
                cArr[i10] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i10) + '\t');
            }
            return cArr;
        }

        private static char[] j() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }
    }

    static abstract class FastMatcher extends CharMatcher {
        FastMatcher() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new NegatedFastMatcher(this);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    private static final class ForPredicate extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Predicate f28830b;

        ForPredicate(Predicate predicate) {
            this.f28830b = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f28830b.apply(Character.valueOf(c10));
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f28830b + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public boolean apply(Character ch2) {
            return this.f28830b.apply(Preconditions.checkNotNull(ch2));
        }
    }

    private static final class InRange extends FastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f28831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f28832c;

        InRange(char c10, char c11) {
            Preconditions.checkArgument(c11 >= c10);
            this.f28831b = c10;
            this.f28832c = c11;
        }

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            bitSet.set(this.f28831b, this.f28832c + 1);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f28831b <= c10 && c10 <= this.f28832c;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.h(this.f28831b) + "', '" + CharMatcher.h(this.f28832c) + "')";
        }
    }

    private static final class Invisible extends RangesMatcher {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final CharMatcher f28833e = new Invisible();

        private Invisible() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    private static final class Is extends FastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f28834b;

        Is(char c10) {
            this.f28834b = c10;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f28834b) ? this : CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            bitSet.set(this.f28834b);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 == this.f28834b;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.f28834b);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f28834b) ? charMatcher : super.or(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString().replace(this.f28834b, c10);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.h(this.f28834b) + "')";
        }
    }

    private static final class IsEither extends FastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f28835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char f28836c;

        IsEither(char c10, char c11) {
            this.f28835b = c10;
            this.f28836c = c11;
        }

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            bitSet.set(this.f28835b);
            bitSet.set(this.f28836c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 == this.f28835b || c10 == this.f28836c;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.h(this.f28835b) + CharMatcher.h(this.f28836c) + "\")";
        }
    }

    private static final class IsNot extends FastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f28837b;

        IsNot(char c10) {
            this.f28837b = c10;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f28837b) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            bitSet.set(0, this.f28837b);
            bitSet.set(this.f28837b + 1, 65536);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 != this.f28837b;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.is(this.f28837b);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f28837b) ? CharMatcher.any() : this;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.h(this.f28837b) + "')";
        }
    }

    private static final class JavaDigit extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final CharMatcher f28838b = new JavaDigit();

        private JavaDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isDigit(c10);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class JavaIsoControl extends NamedFastMatcher {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final CharMatcher f28839c = new JavaIsoControl();

        private JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 > 31) {
                return c10 >= 127 && c10 <= 159;
            }
            return true;
        }
    }

    private static final class JavaLetter extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final CharMatcher f28840b = new JavaLetter();

        private JavaLetter() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLetter(c10);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class JavaLetterOrDigit extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final CharMatcher f28841b = new JavaLetterOrDigit();

        private JavaLetterOrDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class JavaLowerCase extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final CharMatcher f28842b = new JavaLowerCase();

        private JavaLowerCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLowerCase(c10);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class JavaUpperCase extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final CharMatcher f28843b = new JavaUpperCase();

        private JavaUpperCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isUpperCase(c10);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    static abstract class NamedFastMatcher extends FastMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28844b;

        NamedFastMatcher(String str) {
            this.f28844b = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.google.common.base.CharMatcher
        public final String toString() {
            return this.f28844b;
        }
    }

    private static class Negated extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CharMatcher f28845b;

        Negated(CharMatcher charMatcher) {
            this.f28845b = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f28845b.countIn(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f28845b.g(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return !this.f28845b.matches(c10);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f28845b.matchesNoneOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f28845b.matchesAllOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return this.f28845b;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.f28845b + ".negate()";
        }
    }

    private static class NegatedFastMatcher extends Negated {
        NegatedFastMatcher(CharMatcher charMatcher) {
            super(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    private static final class None extends NamedFastMatcher {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final CharMatcher f28846c = new None();

        private None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i10) {
            Preconditions.checkPositionIndex(i10, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    private static final class Or extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CharMatcher f28847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final CharMatcher f28848c;

        Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f28847b = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f28848c = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            this.f28847b.g(bitSet);
            this.f28848c.g(bitSet);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f28847b.matches(c10) || this.f28848c.matches(c10);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.f28847b + ", " + this.f28848c + ")";
        }
    }

    private static class RangesMatcher extends CharMatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f28849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char[] f28850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final char[] f28851d;

        RangesMatcher(String str, char[] cArr, char[] cArr2) {
            this.f28849b = str;
            this.f28850c = cArr;
            this.f28851d = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i10 = 0;
            while (i10 < cArr.length) {
                Preconditions.checkArgument(cArr[i10] <= cArr2[i10]);
                int i11 = i10 + 1;
                if (i11 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i10] < cArr[i11]);
                }
                i10 = i11;
            }
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            int iBinarySearch = Arrays.binarySearch(this.f28850c, c10);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i10 = (~iBinarySearch) - 1;
            return i10 >= 0 && c10 <= this.f28851d[i10];
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.f28849b;
        }
    }

    private static final class SingleWidth extends RangesMatcher {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final CharMatcher f28852e = new SingleWidth();

        private SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    @VisibleForTesting
    static final class Whitespace extends NamedFastMatcher {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f28853c = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final CharMatcher f28854d = new Whitespace();

        Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        void g(BitSet bitSet) {
            for (int i10 = 0; i10 < 32; i10++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i10));
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f28853c) == c10;
        }
    }

    protected CharMatcher() {
    }

    public static CharMatcher any() {
        return Any.f28824c;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new AnyOf(charSequence) : c(charSequence.charAt(0), charSequence.charAt(1)) : is(charSequence.charAt(0)) : none();
    }

    public static CharMatcher ascii() {
        return Ascii.f28826c;
    }

    private String b(CharSequence charSequence, int i10, int i11, char c10, StringBuilder sb2, boolean z10) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (!matches(cCharAt)) {
                sb2.append(cCharAt);
                z10 = false;
            } else if (!z10) {
                sb2.append(c10);
                z10 = true;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static CharMatcher breakingWhitespace() {
        return BreakingWhitespace.f28828b;
    }

    private static IsEither c(char c10, char c11) {
        return new IsEither(c10, c11);
    }

    private static boolean d(int i10, int i11) {
        return i10 <= 1023 && i11 > i10 * 64;
    }

    @Deprecated
    public static CharMatcher digit() {
        return Digit.f28829e;
    }

    private static CharMatcher f(int i10, BitSet bitSet, String str) {
        if (i10 == 0) {
            return none();
        }
        if (i10 == 1) {
            return is((char) bitSet.nextSetBit(0));
        }
        if (i10 != 2) {
            return d(i10, bitSet.length()) ? SmallCharMatcher.k(bitSet, str) : new BitSetMatcher(bitSet, str);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return c(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new ForPredicate(predicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(char c10) {
        char[] cArr = new char[6];
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static CharMatcher inRange(char c10, char c11) {
        return new InRange(c10, c11);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return Invisible.f28833e;
    }

    public static CharMatcher is(char c10) {
        return new Is(c10);
    }

    public static CharMatcher isNot(char c10) {
        return new IsNot(c10);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return JavaDigit.f28838b;
    }

    public static CharMatcher javaIsoControl() {
        return JavaIsoControl.f28839c;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return JavaLetter.f28840b;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return JavaLetterOrDigit.f28841b;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return JavaLowerCase.f28842b;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return JavaUpperCase.f28843b;
    }

    public static CharMatcher none() {
        return None.f28846c;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return SingleWidth.f28852e;
    }

    public static CharMatcher whitespace() {
        return Whitespace.f28854d;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new And(this, charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (matches(cCharAt)) {
                if (cCharAt != c10 || (i10 != length - 1 && matches(charSequence.charAt(i10 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                    sb2.append(c10);
                    return b(charSequence, i10 + 1, length, c10, sb2, true);
                }
                i10++;
            }
            i10++;
            c10 = c10;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (matches(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    CharMatcher e() {
        String strSubstring;
        BitSet bitSet = new BitSet();
        g(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return f(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i10 = 65536 - iCardinality;
        final String string = toString();
        if (string.endsWith(".negate()")) {
            strSubstring = string.substring(0, string.length() - 9);
        } else {
            strSubstring = string + ".negate()";
        }
        return new NegatedFastMatcher(this, f(i10, bitSet, strSubstring)) { // from class: com.google.common.base.CharMatcher.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ CharMatcher f28821d;

            {
                this.f28821d = this;
            }

            @Override // com.google.common.base.CharMatcher.Negated, com.google.common.base.CharMatcher
            public String toString() {
                return string;
            }
        };
    }

    void g(BitSet bitSet) {
        for (int i10 = 65535; i10 >= 0; i10--) {
            if (matches((char) i10)) {
                bitSet.set(i10);
            }
        }
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c10);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public CharMatcher negate() {
        return new Negated(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new Or(this, charMatcher);
    }

    public CharMatcher precomputed() {
        return Platform.h(this);
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i10 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    break;
                }
                charArray[iIndexIn - i10] = charArray[iIndexIn];
                iIndexIn++;
            }
            return new String(charArray, 0, iIndexIn - i10);
            i10++;
        }
    }

    public String replaceFrom(CharSequence charSequence, char c10) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c10;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = c10;
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && matches(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && matches(charSequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return collapseFrom(charSequence, c10);
        }
        int i13 = i12 + 1;
        return b(charSequence, i11, i13, c10, new StringBuilder(i13 - i11), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && matches(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && matches(charSequence.charAt(i11))) {
            i11--;
        }
        return charSequence.subSequence(i10, i11 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!matches(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch2) {
        return matches(ch2.charValue());
    }

    public int indexIn(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i10, length);
        while (i10 < length) {
            if (matches(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i10 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append((CharSequence) string, i10, iIndexIn);
            sb2.append(charSequence2);
            i10 = iIndexIn + 1;
            iIndexIn = indexIn(string, i10);
        } while (iIndexIn != -1);
        sb2.append((CharSequence) string, i10, length2);
        return sb2.toString();
    }
}
