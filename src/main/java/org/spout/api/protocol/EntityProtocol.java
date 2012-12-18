/*
 * This file is part of SpoutAPI.
 *
 * Copyright (c) 2011-2012, Spout LLC <http://www.spout.org/>
 * SpoutAPI is licensed under the Spout License Version 1.
 *
 * SpoutAPI is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * SpoutAPI is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.api.protocol;

import java.util.List;

import org.spout.api.entity.Entity;

/**
 * A class that generates messages associated with entities
 */
public interface EntityProtocol {

	/**
	 * Gets the messages to spawn the entity. The entity should spawn at the 
	 * location at the last snapshot
	 *
	 * @param entity the entity
	 * @return messages to send
	 */
	public List<Message> getSpawnMessages(Entity entity);

	/**
	 * Gets the messages to destroy the entity.
	 *
	 * @param entity the entity
	 * @return messages to send
	 */
	public List<Message> getDestroyMessages(Entity entity);

	/**
	 * Gets the messages to update the entity. This should move the entity from its
	 * snapshot position to its live position.
	 *
	 * @param entity the entity
	 * @return messages to send
	 */
	public List<Message> getUpdateMessages(Entity entity);
}
