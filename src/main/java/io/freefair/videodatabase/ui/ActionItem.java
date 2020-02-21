package io.freefair.videodatabase.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ActionItem {
	private final UUID id = UUID.randomUUID();

	@Setter
	private String name;

	@Setter
	private String description;

	@Setter
	private double progress;
}
