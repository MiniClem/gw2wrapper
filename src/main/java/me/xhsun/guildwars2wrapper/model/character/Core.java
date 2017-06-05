package me.xhsun.guildwars2wrapper.model.character;

import me.xhsun.guildwars2wrapper.model.Item;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * For more info on Character Core API go <a href="https://wiki.guildwars2.com/wiki/API:2/characters#Core">here</a><br/>
 * Character core information model class<br/>
 * Note: age is the amount of seconds this character was played<br/>
 * Note: guild model class and title model class don't exist as of right now
 *
 * @author xhsun
 * @see Item for race and profession enum
 * @since 2017-03-28
 */
public class Core {
	public enum Gender {Male, Female}

	private String name;
	private Item.Restriction race;
	private Gender gender;
	private Item.Restriction profession;
	private int level;
	private String guild;//guild id
	private long age;//in seconds
	private String created;
	private long death;
	private long title;//title id

	public String getName() {
		return name;
	}

	public Item.Restriction getRace() {
		return race;
	}

	public Gender getGender() {
		return gender;
	}

	public Item.Restriction getProfession() {
		return profession;
	}

	public int getLevel() {
		return level;
	}

	public String getGuild() {
		return guild;
	}

	public long getAge() {
		return age;
	}

	public DateTime getCreated() {
		if (created == null) return null;
		DateTimeFormatter formatter = ISODateTimeFormat.dateTimeNoMillis();
		return formatter.parseDateTime(created);
	}

	public long getDeath() {
		return death;
	}

	public long getTitle() {
		return title;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Core core = (Core) o;

		return (name != null ? name.equals(core.name) : core.name == null) &&
				(created != null ? created.equals(core.created) : core.created == null);
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (created != null ? created.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Core{" +
				"name='" + name + '\'' +
				", race=" + race +
				", gender=" + gender +
				", profession=" + profession +
				", level=" + level +
				", guild='" + guild + '\'' +
				", age=" + age +
				", created='" + created + '\'' +
				", death=" + death +
				", title=" + title +
				'}';
	}
}