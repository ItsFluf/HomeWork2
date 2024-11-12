package Task4;

import java.util.*;

public class Solve {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int MinutesHand = 0;
		System.out.println("This program will ask the user to give me the numbers of the hours hand and the minutes hand in his analog clock are on, and output the time back, more readable");
		System.out.println("At what number the hours hand in on?");
		int HoursHand = reader.nextInt();
		
		if (HoursHand < 12) {
			System.out.println("At what number the minutes hand in on?");
			MinutesHand = reader.nextInt();
			if (MinutesHand == 12) {
				System.out.println("the current time is: " + HoursHand + ":00");
			}
			else {
				if (MinutesHand == 1) {
					System.out.println("the current time is: " + HoursHand + ":05");
				}
				else {
					if (MinutesHand == 2) {
						System.out.println("the current time is: " + HoursHand + ":10");
					}
					else {
						if (MinutesHand == 3) {
							System.out.println("the current time is: " + HoursHand + ":15");
						}
						else {
							if (MinutesHand == 4) {
								System.out.println("the current time is: " + HoursHand + ":20");
							}
							else {
								if (MinutesHand == 5) {
									System.out.println("the current time is: " + HoursHand + ":25");
								}
								else {
									if (MinutesHand == 6) {
										System.out.println("the current time is: " + HoursHand + ":30");
									}
									else {
										if (MinutesHand == 7) {
											System.out.println("the current time is: " + HoursHand + ":35");
										}
										else {
											if (MinutesHand == 8) {
												System.out.println("the current time is: " + HoursHand + ":40");
											}
											else {
												if (MinutesHand == 9) {
													System.out.println("the current time is: " + HoursHand + ":45");
												}
												else {
													if (MinutesHand == 10) {
														System.out.println("the current time is: " + HoursHand + ":50");
													}
													else {
														if (MinutesHand == 11) {
															System.out.println("the current time is: " + HoursHand + ":55");
														}
														else {
															System.out.println("Unknown Time");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		else {
			if (HoursHand == 12) {
				System.out.println("At what number the minutes hand in on?");
				MinutesHand = reader.nextInt();
				if (MinutesHand == 12) {
					System.out.println("the current time is: 00:00");
				}
				else {
					if (MinutesHand == 1) {
						System.out.println("the current time is: 00:05");
					}
					else {
						if (MinutesHand == 2) {
							System.out.println("the current time is: 00:10");
						}
						else {
							if (MinutesHand == 3) {
								System.out.println("the current time is: 00:15");
							}
							else {
								if (MinutesHand == 4) {
									System.out.println("the current time is: 00:20");
								}
								else {
									if (MinutesHand == 5) {
										System.out.println("the current time is: 00:25");
									}
									else {
										if (MinutesHand == 6) {
											System.out.println("the current time is: 00:30");
										}
										else {
											if (MinutesHand == 7) {
												System.out.println("the current time is: 00:35");
											}
											else {
												if (MinutesHand == 8) {
													System.out.println("the current time is: 00:40");
												}
												else {
													if (MinutesHand == 9) {
														System.out.println("the current time is: 00:45");
													}
													else {
														if (MinutesHand == 10) {
															System.out.println("the current time is: 00:50");
														}
														else {
															if (MinutesHand == 11) {
																System.out.println("the current time is: 00:55");
															}
															else {
																System.out.println("Unknown Time");
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			else {
				System.out.println("Unknown Time");
			}
		}
	}
}
