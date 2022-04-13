package com.coolweather.android;

import org.litepal.crud.DataSupport;

public class db {
    public class Province extends DataSupport{
        private int id;
        private String provinceName;
        private int provinceCode;
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }
        public String getProvinceName(){
            return provinceName;
        }
        public void setProvinceName(String provinceName){
            this.provinceName = provinceName;
        }
        public int getProvinceCode(){
            return provinceCode;
        }
        public void setProvinceCode(int provinceCode){
            this.provinceCode = provinceCode;
        }
    }
    public class County extends DataSupport {
        private int id;
        private String countyName;
        private String weatherId;
        private int cityId;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getCountyName() {
            return countyName;
        }
        public void setCountyName(String countyName) {
            this.countyName = countyName;
        }
        public String getWeatherId() {
            return weatherId;
        }
        public void setWeatherId(String weatherId) {
            this.weatherId = weatherId;
        }
        public int getCityId() {
            return cityId;
        }
        public void setCityId(int cityId) {
            this.cityId = cityId;
        }
    }
    public class City extends DataSupport {
        private int id;
        private String cityName;
        private int cityCode;
        private int provinceId;
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getCityName() {
            return cityName;
        }
        public void setCityName(String cityName) {
            this.cityName = cityName;
        }
        public int getCityCode() {
            return cityCode;
        }
        public void setCityCode(int cityCode) {
            this.cityCode = cityCode;
        }
        public int getProvinceId() {
            return provinceId;
        }
        public void setProvinceId(int provinceId) {
            this.provinceId = provinceId;
        }
    }
}

