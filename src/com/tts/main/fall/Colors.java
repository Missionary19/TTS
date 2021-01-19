package com.tts.main.fall;

class fall {

    public class Colors {
        private String name;
        private String type;
        private String location;

        public Colors() {
            name = "default name";
            location = "location";
            type = "type";

        }

        public Colors(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public Colors(String name, String type, String location) {
            this.name = name;
            this.type = type;
            this.location = location;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getType() {
            return type;


        }

        @Override
        public String toString() {
            return "Colors{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        }
    }
}

