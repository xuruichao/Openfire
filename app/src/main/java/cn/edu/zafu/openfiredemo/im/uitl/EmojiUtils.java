package cn.edu.zafu.openfiredemo.im.uitl;

/**
 * 所有表情
 * Created by ${xielei} on 2018/3/26.
 */

public class EmojiUtils {

    private static int emojiArray[] = {0x1F600,
            0x1F601,
            0x1F602,
            0x1F603,
            0x1F604,
            0x1F605,
            0x1F606,
            0x1F607,
            0x1F608,
            0x1F609,
            0x1F60A,
            0x1F60B,
            0x1F60C,
            0x1F60D,
            0x1F60E,
            0x1F60F,
            0x1F610,
            0x1F611,
            0x1F612,
            0x1F613,
            0x1F614,
            0x1F615,
            0x1F616,
            0x1F617,
            0x1F618,
            0x1F619,
            0x1F61A,
            0x1F61B,
            0x1F61C,
            0x1F61D,
            0x1F61E,
            0x1F61F,
            0x1F620,
            0x1F621,
            0x1F622,
            0x1F623,
            0x1F624,
            0x1F625,
            0x1F626,
            0x1F627,
            0x1F628,
            0x1F629,
            0x1F62A,
            0x1F62B,
            0x1F62C,
            0x1F62D,
            0x1F62E,
            0x1F62F,
            0x1F630,
            0x1F631,
            0x1F632,
            0x1F633,
            0x1F634,
            0x1F635,
            0x1F636,
            0x1F637,
            0x1F638,
            0x1F639,
            0x1F63A,
            0x1F63B,
            0x1F63C,
            0x1F63D,
            0x1F63E,
            0x1F63F,
            0x1F640,
            0x1F645,
            0x1F646,
            0x1F647,
            0x1F648,
            0x1F649,
            0x1F64A,
            0x1F64B,
            0x1F64C,
            0x1F64D,
            0x1F64E,
            0x1F64F
    };

    public static String getEmojiStringByPosition(int position) {
        int unicode =  emojiArray[position];
        return new String(Character.toChars(unicode));
    }

    public static String getEmojiStringByUnicode(int unicode) {
        return new String(Character.toChars(unicode));
    }
}
