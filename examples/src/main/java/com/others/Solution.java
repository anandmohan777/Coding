package com.others;

import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

	public static void main(String[] args) {

		Map<String, String> meetingSchedule = new LinkedHashMap<>();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String inputStartTime = scan.next();
			String inputEndTime = scan.next();
			char s = ':';

			String newStartTime = Character.toString(inputStartTime.charAt(0))
					+ Character.toString(inputStartTime.charAt(1))
					+ Character.toString(s)
					+ Character.toString(inputStartTime.charAt(2))
					+ Character.toString(inputStartTime.charAt(3));
			String newEndTime = Character.toString(inputEndTime.charAt(0))
					+ Character.toString(inputEndTime.charAt(1))
					+ Character.toString(s)
					+ Character.toString(inputEndTime.charAt(2))
					+ Character.toString(inputEndTime.charAt(3));
			LocalTime startTime = LocalTime.parse(newStartTime);
			LocalTime endTime = LocalTime.parse(newEndTime);
			System.out.println(startTime);
			System.out.println(endTime);

			String meetingRequest = scan.next() + scan.next() + " "
					+ scan.next();
			String employeeId = meetingRequest.substring(meetingRequest
					.lastIndexOf(" ") + 1);
			System.out.println(employeeId);
			String meetingDate = scan.next();
			System.out.println(meetingDate);
			LocalTime meetingStartTime = LocalTime.parse(scan.next());
			System.out.println(meetingStartTime);
			long duration = scan.nextInt();
			System.out.println(duration);
			if ((meetingStartTime.isAfter(startTime) || meetingStartTime
					.equals(startTime))
					&& (meetingStartTime.plusHours(duration).isAfter(endTime))) {
				meetingSchedule.put(meetingDate, meetingStartTime + " "
						+ meetingStartTime.plusHours(duration) + " "
						+ employeeId);
				System.out.println("yes");
			}
			for (String key : meetingSchedule.keySet()) {
				System.out.println("in th for loop");
				System.out.println(key);
				System.out.println(meetingSchedule.get(key));
			}
			
			
		}
	}
}
// }

