package com.javaex.ex08;

public class TV {

	
	// 필드

	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public TV() {
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	

	// 메소드 getter/setter

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} 
		else {
			this.power = false;
		}
	}

	public void channel(int channel) {
		if(this.power == true) {
			if (255 < channel) {
				this.channel = 255;
			} 
			else if (channel < 1) {
				this.channel = 1;
			} 
			else {
				this.channel = channel;
			}
		}
	}

	public void channel(boolean up) {
		if(this.power == true) {
			if (up == true) {
				if(this.channel >255) {
					this.channel = 255;
				}
				else {
					this.channel++;	
				}
			} 
			else {
				if(this.channel < 0) {
					this.channel = 1;
				}
				else {
					this.channel--;
				}
			}
		}
	}

	public void volume(int volume) {
		if(this.power == true) {
			if (100 < volume) {
				this.volume = 100;
			} 
			else if (volume < 0) {
				this.volume = 0;
			} 
			else {
				this.volume = volume;
			}
		}
	}

	public void volume(boolean volume) {
		if(this.power == true) {
			if (volume == true) {
				if(this.volume > 100) {
					this.volume = 100;
				}
				else {
					this.volume++;
				}
			} 
			else {
				if(this.volume < 0) {
					this.volume = 0;
				}
				else {
					this.volume--;
				}
			}
		}
	}

	// 메소드 일반
	
	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}
}
