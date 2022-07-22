package com.dji.sample.manage.model.enums;

import lombok.Getter;

import java.util.Arrays;

/**
 * @author sean
 * @version 1.1
 * @date 2022/7/7
 */
@Getter
public enum HmsEnum {

    IN_THE_SKY("_in_the_sky", 1);

    private int val;

    private String text;

    HmsEnum(String text, int val) {
        this.text = text;
        this.val = val;
    }

    @Getter
    public enum MessageLanguage {

        EN("en"),

        ZH("zh");

        String language;

        MessageLanguage(String language) {
            this.language = language;
        }
    }

    @Getter
    public enum DomainType {
        DRONE_NEST("drone_nest"),

        DRONE("drone");

        private String domain;

        DomainType(String domain) {
            this.domain = domain;
        }

    }

    @Getter
    public enum HmsFaqIdEnum {

        FPV_TIP("fpv_tip_");

        private String text;

        HmsFaqIdEnum(String text) {
            this.text = text;
        }

    }

    @Getter
    public enum HmsBatteryIndexEnum {
        LEFT(0, "left", "左"),

        RIGHT(1, "right", "右"),

        UNKNOWN(-1, "unknown", "未知");

        private int val;

        private String en;

        private String zh;

        HmsBatteryIndexEnum(int val, String en, String zh) {
            this.val = val;
            this.en = en;
            this.zh = zh;
        }

        public static HmsBatteryIndexEnum find(int val) {
            return Arrays.stream(HmsBatteryIndexEnum.values())
                    .filter(battery -> battery.val == val)
                    .findAny()
                    .orElse(UNKNOWN);
        }
    }

    @Getter
    public enum HmsDockCoverIndexEnum {
        LEFT(0, "left", "左"),

        RIGHT(1, "right", "右"),

        UNKNOWN(-1, "unknown", "未知");

        private int val;

        private String en;

        private String zh;

        HmsDockCoverIndexEnum(int val, String en, String zh) {
            this.val = val;
            this.en = en;
            this.zh = zh;
        }

        public static HmsDockCoverIndexEnum find(int val) {
            return Arrays.stream(HmsDockCoverIndexEnum.values())
                    .filter(dockCover -> dockCover.val == val)
                    .findAny()
                    .orElse(UNKNOWN);
        }
    }

    @Getter
    public enum HmsChargingRodIndexEnum {

        FRONT(0, "front", "前"),

        BACK(1, "back", "后"),

        LEFT(2, "left", "左"),

        RIGHT(3, "right", "右"),

        UNKNOWN(-1, "unknown", "未知");

        private int val;

        private String en;

        private String zh;

        HmsChargingRodIndexEnum(int val, String en, String zh) {
            this.val = val;
            this.en = en;
            this.zh = zh;
        }

        public static HmsChargingRodIndexEnum find(int val) {
            return Arrays.stream(HmsChargingRodIndexEnum.values())
                    .filter(rod -> rod.val == val)
                    .findAny()
                    .orElse(UNKNOWN);
        }
    }
}
