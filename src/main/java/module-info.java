/*
 * pragmatickm-password-all - Convenience POM to include most PragmaticKM Password features, not including documentation or examples.
 * Copyright (C) 2021  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of pragmatickm-password-all.
 *
 * pragmatickm-password-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * pragmatickm-password-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with pragmatickm-password-all.  If not, see <http://www.gnu.org/licenses/>.
 */
module com.pragmatickm.password.all {
	// Direct
	requires transitive com.pragmatickm.password.model; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-model</artifactId>
	requires transitive com.pragmatickm.password.servlet; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-servlet</artifactId>
	requires transitive com.pragmatickm.password.taglib; // <groupId>com.pragmatickm</groupId><artifactId>pragmatickm-password-taglib</artifactId>
}
