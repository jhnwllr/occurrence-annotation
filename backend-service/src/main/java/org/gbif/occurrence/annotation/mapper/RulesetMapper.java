/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gbif.occurrence.annotation.mapper;

import org.gbif.occurrence.annotation.model.Ruleset;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RulesetMapper {
  List<Ruleset> list(
      @Param("projectId") Integer projectId,
      @Param("limit") int limit,
      @Param("offset") int offset);

  Ruleset get(@Param("id") int id);

  void create(Ruleset rule);

  void update(Ruleset rule);

  void delete(@Param("id") int id, @Param("username") String username);

  void deleteByProject(@Param("projectId") int id, @Param("username") String username);
}
