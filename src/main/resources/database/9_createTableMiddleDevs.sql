create table middle_developers as
select developers.name as developer, skills.name as skill from developers
inner join developers_skills on developers_skills.developer_id = developers.id
inner join skills on developers_skills.skill_id = skills.id
where skills.level = 'Middle';