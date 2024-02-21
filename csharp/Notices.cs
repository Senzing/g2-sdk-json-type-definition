// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(NoticesJsonConverter))]
    public class Notices
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<Notice> Value { get; set; }
    }

    public class NoticesJsonConverter : JsonConverter<Notices>
    {
        public override Notices Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new Notices { Value = JsonSerializer.Deserialize<IList<Notice>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, Notices value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<Notice>>(writer, value.Value, options);
        }
    }
}
