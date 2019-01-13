export class People {
    people_id: number;
    surname: string;
    age: number;

    constructor(values: Object = {}) {
        Object.assign(this, values);
      }
}
