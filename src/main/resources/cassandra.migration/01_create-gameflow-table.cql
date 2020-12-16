CREATE TABLE IF NOT EXISTS clicker.gameflow
(
    user_id uuid PRIMARY KEY,

    last_click_timestamp      timestamp,
    current_click_entity_id   uuid,
    entity_progress_remaining decimal,
    entity_complexity         decimal,
    user_skill                decimal
);