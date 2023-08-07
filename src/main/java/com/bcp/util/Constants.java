package com.bcp.util;

public class Constants {

    public static class BaseResponseErrorMessages {
        public static final String AGENCY = "Agency";
        public static final String CITY = "City";
        public static final String COUNTRY_CODE = "Country Code";
        public static final String BANK = "Bank";
        public static final String ALREADY_EXISTS = "already exists !";
        public static final String NOT_FOUND = "not found !";
        public static final String WAS_NOT_DELETED = "was not deleted !";

        public static String getBcpAgencyNotFound(String agencyCode) {
            return AGENCY + " with code " + agencyCode + " " + NOT_FOUND;
        }

        public static String getChaabiBankAgencyNotFound(String agencyCode) {
            return AGENCY + " with code " + agencyCode + " " + NOT_FOUND;
        }

        public static String getCityNotFound(String cityCode) {
            return CITY + " with code " + cityCode + " " + NOT_FOUND;
        }

        public static String getBankNotFound(String bankCode) {
            return BANK + " with code " + bankCode + " " + NOT_FOUND;
        }

        public static String getAgencyAlreadyExists() {
            return AGENCY + " " + ALREADY_EXISTS;
        }

        public static String getCityAlreadyExists() {
            return CITY + " " + ALREADY_EXISTS;
        }

        public static String getAgencyWasNotDeleted() {
            return AGENCY + " " + WAS_NOT_DELETED;
        }

        public static String getCityWasNotDeleted() {
            return CITY + " " + WAS_NOT_DELETED;
        }

        public static String getCountryCodeNotFound(String code) {
            return COUNTRY_CODE + " with code " + code + " " + NOT_FOUND;
        }
    }

}