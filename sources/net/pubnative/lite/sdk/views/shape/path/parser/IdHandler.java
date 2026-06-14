package net.pubnative.lite.sdk.views.shape.path.parser;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class IdHandler {
    private static final String TAG = SvgToPath.TAG;
    private final XmlPullParser atts;
    final HashMap<String, String> idXml = new HashMap<>();
    private final Stack<IdRecording> idRecordingStack = new Stack<>();

    class IdRecording {

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        final String f96050id;
        int level = 0;

        /* JADX INFO: renamed from: sb, reason: collision with root package name */
        final StringBuilder f96051sb = new StringBuilder();

        public IdRecording(String str) {
            this.f96050id = str;
        }
    }

    IdHandler(XmlPullParser xmlPullParser) {
        this.atts = xmlPullParser;
    }

    private void appendElementString(StringBuilder sb2, String str, XmlPullParser xmlPullParser) {
        sb2.append("<");
        sb2.append(str);
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            sb2.append(" ");
            sb2.append(xmlPullParser.getAttributeName(i10));
            sb2.append("='");
            sb2.append(ParseUtil.escape(xmlPullParser.getAttributeValue(i10)));
            sb2.append("'");
        }
        sb2.append(">");
    }

    void endElement() {
        String name = this.atts.getName();
        if (this.idRecordingStack.size() > 0) {
            IdRecording idRecordingLastElement = this.idRecordingStack.lastElement();
            idRecordingLastElement.f96051sb.append("</");
            idRecordingLastElement.f96051sb.append(name);
            idRecordingLastElement.f96051sb.append(">");
            int i10 = idRecordingLastElement.level - 1;
            idRecordingLastElement.level = i10;
            if (i10 == 0) {
                String string = idRecordingLastElement.f96051sb.toString();
                this.idXml.put(idRecordingLastElement.f96050id, string);
                this.idRecordingStack.pop();
                if (this.idRecordingStack.size() > 0) {
                    this.idRecordingStack.lastElement().f96051sb.append(string);
                }
                Log.w(TAG, string);
            }
        }
    }

    public void processIds() throws XmlPullParserException, IOException {
        int eventType = this.atts.getEventType();
        do {
            if (eventType != 0 && eventType != 1) {
                if (eventType == 2) {
                    startElement();
                } else if (eventType == 3) {
                    endElement();
                }
            }
            eventType = this.atts.next();
        } while (eventType != 1);
    }

    void startElement() {
        String name = this.atts.getName();
        String stringAttr = ParseUtil.getStringAttr("id", this.atts);
        if (stringAttr != null) {
            this.idRecordingStack.push(new IdRecording(stringAttr));
        }
        if (this.idRecordingStack.size() > 0) {
            IdRecording idRecordingLastElement = this.idRecordingStack.lastElement();
            idRecordingLastElement.level++;
            appendElementString(idRecordingLastElement.f96051sb, name, this.atts);
        }
    }
}
