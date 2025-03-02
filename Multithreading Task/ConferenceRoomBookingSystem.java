package com.insight;
class ConferenceRoomBookingJob {
    private boolean isAvailable = true;  

    
    public synchronized boolean checkAvailability() {
        return isAvailable;
    }

    public synchronized boolean bookRoom() {
        if (isAvailable) {
            isAvailable = false; 
            return true;
        }
        return false;
    }

   
    public synchronized void releaseRoom() {
        isAvailable = true;
    }
    public void conductMeeting(String managerName) {
        if (bookRoom()) {
            System.out.println(managerName + " has booked the conference room and is conducting the meeting.");
            try {
 
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            releaseRoom();
            System.out.println(managerName + " has finished the meeting and released the conference room.");
        } else {
            System.out.println(managerName + " could not book the room as it is already in use.");
        }
    }
}

class Manager extends Thread {
    private String managerName;
    private ConferenceRoomBookingJob bookingJob;

    public Manager(String managerName, ConferenceRoomBookingJob bookingJob) {
        this.managerName = managerName;
        this.bookingJob = bookingJob;
    }

    @Override
    public void run() {
        System.out.println(managerName + " is checking the conference room availability...");
        bookingJob.conductMeeting(managerName);
    }
}

public class ConferenceRoomBookingSystem {
    public static void main(String[] args) {
        
        ConferenceRoomBookingJob bookingJob = new ConferenceRoomBookingJob();
        Manager manager1 = new Manager("Manager 1", bookingJob);
        Manager manager2 = new Manager("Manager 2", bookingJob);
        manager1.start();
        manager2.start();

        try {
            manager1.join();
            manager2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

