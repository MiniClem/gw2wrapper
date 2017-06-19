package me.xhsun.guildwars2wrapper.model.guild;

import me.xhsun.guildwars2wrapper.model.indentifiable.IdentifiableInt;
import me.xhsun.guildwars2wrapper.model.indentifiable.NameableStr;

import java.util.List;

/**
 * For more info on guild API go <a href="https://wiki.guildwars2.com/wiki/API:2/guild/:id">here</a><br/>
 * Model class for guild
 *
 * @author xhsun
 * @since 2017-06-19
 */
public class Guild extends NameableStr {
	public enum EmblemFlag {FlipBackgroundHorizontal, FlipBackgroundVertical}

	private int level, aetherium;
	private String motd, tag;
	private long influence, favor;
	private Emblem emblem;

	public int getLevel() {
		return level;
	}

	public int getAetherium() {
		return aetherium;
	}

	public String getMotd() {
		return motd;
	}

	public String getTag() {
		return tag;
	}

	public long getInfluence() {
		return influence;
	}

	public long getFavor() {
		return favor;
	}

	public Emblem getEmblem() {
		return emblem;
	}

	@Override
	public String toString() {
		return "Guild{" +
				super.toString() +
				", level=" + level +
				", aetherium=" + aetherium +
				", motd='" + motd + '\'' +
				", tag='" + tag + '\'' +
				", influence=" + influence +
				", favor=" + favor +
				", emblem=" + emblem +
				'}';
	}

	public class Emblem {
		private EmblemDetail background, foreground;
		private List<EmblemFlag> flags;

		public EmblemDetail getBackground() {
			return background;
		}

		public EmblemDetail getForeground() {
			return foreground;
		}

		public List<EmblemFlag> getFlags() {
			return flags;
		}

		@Override
		public String toString() {
			return "Emblem{" +
					"background=" + background +
					", foreground=" + foreground +
					", flags=" + flags +
					'}';
		}
	}

	public class EmblemDetail extends IdentifiableInt {
		private List<Integer> colors;

		public List<Integer> getColors() {
			return colors;
		}

		@Override
		public String toString() {
			return "EmblemDetail{" +
					"id=" + getId() +
					", colors=" + colors +
					'}';
		}
	}
}
