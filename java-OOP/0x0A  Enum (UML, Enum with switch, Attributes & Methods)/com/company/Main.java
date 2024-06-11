package com.company;

public class Main {
    enum WeekDays {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY("Day OFF"),
        SATURDAY("Day OFF"),
        SUNDAY("Day OFF");

        private String status;

        WeekDays() {
            this.status = "Working Day";
        }

        WeekDays(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        
        // public abstract  void testMethod();
    }

    public static void main(String[] args) {
        System.out.println( "\n"+ WeekDays.MONDAY.getStatus());
        System.out.println(WeekDays.FRIDAY.getStatus());
    }
}
